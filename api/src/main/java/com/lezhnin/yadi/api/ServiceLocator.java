package com.lezhnin.yadi.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ServiceLocator {

    @Nullable
    <T> T locate(@Nonnull Class<T> beanType);
}
