package stackoverflow.mixin.a;

import org.codehaus.jackson.annotate.JsonProperty;

public abstract class MixIn {
     MixIn(@JsonProperty("name") String name, @JsonProperty("value") String value) { }
}