package com.workincode.indicador.api.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.workincode.indicador.api.model.IndicadorRequest;
import com.workincode.indicador.api.model.IndicadorResponse;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link IndicadorApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-10T19:56:12.738-04:00[America/Santiago]")
public interface IndicadorApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /indicador/ : Obtiene el indicador deseado
     *
     * @param indicadorRequest Se envia una fecha y el indicador deseado por body (optional)
     * @return obtiene el usuario (status code 200)
     * @see IndicadorApi#indicadorPost
     */
    default ResponseEntity<IndicadorResponse> indicadorPost(IndicadorRequest indicadorRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"unidad\" : \"Pesos\", \"fecha\" : \"dd-mm-yyyy\", \"codigo\" : \"utm\", \"valor\" : 12.3, \"nombre\" : \"Unidad Tributaria Mensual (UTM)\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
