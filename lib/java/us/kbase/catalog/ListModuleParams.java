
package us.kbase.catalog;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: ListModuleParams</p>
 * <pre>
 * Describes how to filter repositories.
 * include_released - optional flag indicated modules that are released are included (default:true)
 * include_unreleased - optional flag indicated modules that are not released are included (default:false)
 * with_disabled - optional flag indicating disabled repos should be included (default:false).
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "include_released",
    "include_unreleased",
    "include_disabled"
})
public class ListModuleParams {

    @JsonProperty("include_released")
    private Long includeReleased;
    @JsonProperty("include_unreleased")
    private Long includeUnreleased;
    @JsonProperty("include_disabled")
    private Long includeDisabled;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("include_released")
    public Long getIncludeReleased() {
        return includeReleased;
    }

    @JsonProperty("include_released")
    public void setIncludeReleased(Long includeReleased) {
        this.includeReleased = includeReleased;
    }

    public ListModuleParams withIncludeReleased(Long includeReleased) {
        this.includeReleased = includeReleased;
        return this;
    }

    @JsonProperty("include_unreleased")
    public Long getIncludeUnreleased() {
        return includeUnreleased;
    }

    @JsonProperty("include_unreleased")
    public void setIncludeUnreleased(Long includeUnreleased) {
        this.includeUnreleased = includeUnreleased;
    }

    public ListModuleParams withIncludeUnreleased(Long includeUnreleased) {
        this.includeUnreleased = includeUnreleased;
        return this;
    }

    @JsonProperty("include_disabled")
    public Long getIncludeDisabled() {
        return includeDisabled;
    }

    @JsonProperty("include_disabled")
    public void setIncludeDisabled(Long includeDisabled) {
        this.includeDisabled = includeDisabled;
    }

    public ListModuleParams withIncludeDisabled(Long includeDisabled) {
        this.includeDisabled = includeDisabled;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("ListModuleParams"+" [includeReleased=")+ includeReleased)+", includeUnreleased=")+ includeUnreleased)+", includeDisabled=")+ includeDisabled)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
