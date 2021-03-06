package com.lezhnin.yadi.api;

import javax.annotation.Nonnull;

public interface ServiceImplementor<T> {

    @Nonnull
    ServiceBinder to(@Nonnull ServiceProvider<? extends T> serviceProvider);
}
