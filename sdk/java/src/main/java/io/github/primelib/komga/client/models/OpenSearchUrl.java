// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * OpenSearchUrl
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("OpenSearchUrl")
@JsonPropertyOrder({
    "template",
    "type"
})
@Generated(value = "io.github.primelib.primecodegen")
public class OpenSearchUrl {

    @JsonProperty("template")
    protected String template;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link OpenSearchUrl}.
     *
     * @param spec the specification to process
     */
    public OpenSearchUrl(Consumer<OpenSearchUrl> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OpenSearchUrl}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OpenSearchUrl(Consumer)} instead.
     * @param template template
     * @param type type
     */
    @ApiStatus.Internal
    public OpenSearchUrl(String template, String type) {
        this.template = template;
        this.type = type;
    }
}
