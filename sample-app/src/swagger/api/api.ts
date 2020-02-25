export * from "./productController.service";
import { ProductControllerService } from "./productController.service";
export * from "./categoryController.service";
import { CategoryControllerService } from "./categoryController.service";
export * from "./userController.service";
import { UserControllerService } from "./userController.service";
export const APIS = [ProductControllerService, CategoryControllerService, UserControllerService];
