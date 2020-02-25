package com.techmaster.sample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.Flux;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Flux<Integer> j = Flux.just(1, 2, 3, 4, 5);
//
//		j.log().map(i -> i * 10).subscribe(System.out::println);

		List<Integer> elements = new ArrayList<>();
		Flux.just(1, 2, 3, 4).log().limitRate(3).subscribe(i -> elements.add(i));

//		Flux.just(1, 2, 3, 4).log().subscribe(new Subscriber<Integer>() {
//
//			private Subscription s;
//			int onNextAmount;
//
//			@Override
//			public void onSubscribe(Subscription s) {
//				this.s = s;
//				s.request(2);
//			}
//
//			@Override
//			public void onNext(Integer i) {
//				elements.add(i);
//				onNextAmount++;
//
//				if (onNextAmount % 2 == 0) {
//					s.request(2);
//				}
//			}
//
//			@Override
//			public void onError(Throwable t) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void onComplete() {
//				// TODO Auto-generated method stub
//
//			}
//		});
	}
}
