package pe.ty.test.webflux.autoconfigure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import pe.ty.webflux.autoconfigure.TyJacksonAutoConfiguration;
import pe.ty.webflux.autoconfigure.TyReactiveExceptionHandlerAutoConfiguration;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@OverrideAutoConfiguration(enabled = true)
@ImportAutoConfiguration({TyReactiveExceptionHandlerAutoConfiguration.class,
    TyJacksonAutoConfiguration.class})
public @interface WebFluxConfigurationTest {

}
