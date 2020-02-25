import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { JwtHelperService } from '@auth0/angular-jwt';
import { Product, ProductControllerService, Category, CategoryControllerService, User, UserControllerService } from 'src/swagger';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.scss']
})
export class ProductCreateComponent implements OnInit {

  productForm: FormGroup;
  categories: Array<Category>;
  user: User;

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private productService: ProductControllerService,
    private categoryService: CategoryControllerService,
    private userService: UserControllerService
  ) { 
    const helper = new JwtHelperService();

    const decodedToken = helper.decodeToken(localStorage.getItem('techmaster_token'));

    this.createForm();

    this.categoryService.getAllCategoriesUsingGET().subscribe(res => {
      this.categories = res;
    });

    this.userService.getUserUsingGET(decodedToken.user_name).subscribe(res => {
      this.user = res;
    });


  }

  ngOnInit() {
  }

  private createForm() {
    this.productForm = this.formBuilder.group({
      name: ['', [Validators.required, Validators.minLength(3)]],
      category: ['', Validators.required]
    });
  }

  create() {
    let product: Product = {};
    product.name = this.productForm.value.name;
    product.category = this.productForm.value.category;
    product.user = this.user;

    console.log(product.category);

    this.productService.saveProductUsingPOST(product).subscribe(res => {
      this.router.navigate(['/products']);
    });
  }

  cancel(){
    this.router.navigate(['/products']); 
  }

}
