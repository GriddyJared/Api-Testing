package PojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @ToString
public class Views {
    @JsonProperty
    private String viewType;
    @JsonProperty
    private boolean enabled;
    @JsonProperty
    private String _id;
}
