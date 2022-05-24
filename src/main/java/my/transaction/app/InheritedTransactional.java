package my.transaction.app;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Transactional(rollbackFor = Throwable.class)
@Inherited
public @interface InheritedTransactional {
}