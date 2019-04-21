/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateMediaDto;
import org.openapitools.model.EditMediaDto;
import org.openapitools.model.KeyValueDto;
import java.util.List;
import org.openapitools.model.Media;
import org.openapitools.model.MediaFile;
import org.openapitools.model.MediaRes;
import org.openapitools.model.ResultListMediaRes;
import org.openapitools.model.UploadMultipleRes;
import org.openapitools.model.UploadRes;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-21T15:04:16.680Z[Etc/UTC]")

@Validated
@Api(value = "media", description = "the media API")
public interface MediaApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "mediaCreate", notes = "", response = MediaRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = MediaRes.class) })
    @RequestMapping(value = "/media/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<MediaRes> mediaCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateMediaDto createMediaDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"{}\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaFindOne", notes = "", response = Media.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Media.class) })
    @RequestMapping(value = "/media/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Media> mediaFindOne(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"{}\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaQuery", notes = "", response = ResultListMediaRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ResultListMediaRes.class) })
    @RequestMapping(value = "/media/query",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResultListMediaRes> mediaQuery(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "", defaultValue = "1.0d") @Valid @RequestParam(value = "page", required = false, defaultValue="1.0d") Double page,@ApiParam(value = "", defaultValue = "10.0d") @Valid @RequestParam(value = "size", required = false, defaultValue="10.0d") Double size,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"query\" : {    \"size\" : 6.02745618307040320615897144307382404804229736328125,    \"page\" : 1.46581298050294517310021547018550336360931396484375  },  \"count\" : 0.80082819046101150206595775671303272247314453125,  \"list\" : [ {    \"ext\" : \"{}\",    \"name\" : \"name\",    \"caption\" : \"caption\",    \"description\" : \"description\",    \"id\" : \"id\",    \"uri\" : \"uri\",    \"url\" : \"url\"  }, {    \"ext\" : \"{}\",    \"name\" : \"name\",    \"caption\" : \"caption\",    \"description\" : \"description\",    \"id\" : \"id\",    \"uri\" : \"uri\",    \"url\" : \"url\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaRemove", notes = "", response = Boolean.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Boolean.class) })
    @RequestMapping(value = "/media/{id}",
        produces = { "text/html" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Boolean> mediaRemove(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaSearch", notes = "", response = KeyValueDto.class, responseContainer = "List", tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = KeyValueDto.class, responseContainer = "List") })
    @RequestMapping(value = "/media/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<KeyValueDto>> mediaSearch(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "value", required = false) String value) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"label\" : \"label\",  \"value\" : \"value\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaUpdate", notes = "", response = MediaRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = MediaRes.class) })
    @RequestMapping(value = "/media/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<MediaRes> mediaUpdate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EditMediaDto editMediaDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"{}\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaUploadFile", notes = "", response = UploadRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = UploadRes.class) })
    @RequestMapping(value = "/media/upload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UploadRes> mediaUploadFile(@ApiParam(value = "" ,required=true )  @Valid @RequestBody MediaFile mediaFile) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"file\" : \"file\",  \"ok\" : true,  \"error\" : \"error\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "mediaUploadFiles", notes = "", response = UploadMultipleRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = UploadMultipleRes.class) })
    @RequestMapping(value = "/media/uploads",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UploadMultipleRes> mediaUploadFiles(@ApiParam(value = ""  )  @Valid @RequestBody List<String> requestBody) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"files\" : [ \"files\", \"files\" ],  \"ok\" : true,  \"error\" : \"error\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
