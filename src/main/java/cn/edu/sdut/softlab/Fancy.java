package cn.edu.sdut.softlab;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Target({ TYPE, METHOD, FIELD, PARAMETER })
@Retention(RUNTIME)
public @interface Fancy {

}
