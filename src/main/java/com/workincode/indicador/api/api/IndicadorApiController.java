package com.workincode.indicador.api.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-10T19:56:12.738-04:00[America/Santiago]")
@Controller
@RequestMapping("${openapi.consultaIndicadores.base-path:}")
public class IndicadorApiController implements IndicadorApi {

    private final IndicadorApiDelegate delegate;

    public IndicadorApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) IndicadorApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new IndicadorApiDelegate() {});
    }

    @Override
    public IndicadorApiDelegate getDelegate() {
        return delegate;
    }

}
