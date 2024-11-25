package br.com.wm.ecommerce.consumer;

public interface ServiceFactory<T> {
    ConsumerService<T> create();
}
