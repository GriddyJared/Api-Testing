package PojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @ToString @Setter @Getter
public class CreatingANewBoard {
    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String desc;

    @JsonProperty
    private Object descData;

    @JsonProperty
    private String idOrganization;

    @JsonProperty
    private String idBoardSource;

    @JsonProperty
    private Boolean defaultLabels;

    @JsonProperty
    private Boolean defaultLists;

    @JsonProperty
    private Prefs prefs;

    @JsonProperty
    private Labels labels;

    @JsonProperty
    private boolean closed;

    @JsonProperty
    private String idEnterprise;

    @JsonProperty
    private boolean pinned;

    @JsonProperty
    private String url;

    @JsonProperty
    private String shortUrl;

    @JsonProperty
    private Labels labelNames;

    @JsonProperty
    private Limits limits;
}
