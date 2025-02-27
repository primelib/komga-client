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
 * CollectionCreationDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("CollectionCreationDto")
@JsonPropertyOrder({
    "name",
    "ordered",
    "seriesIds"
})
@Generated(value = "io.github.primelib.primecodegen")
public class CollectionCreationDto {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("ordered")
    protected Boolean ordered;

    @JsonProperty("seriesIds")
    protected String[] seriesIds;

    /**
     * Constructs a validated instance of {@link CollectionCreationDto}.
     *
     * @param spec the specification to process
     */
    public CollectionCreationDto(Consumer<CollectionCreationDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CollectionCreationDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CollectionCreationDto(Consumer)} instead.
     * @param name name
     * @param ordered ordered
     * @param seriesIds seriesIds
     */
    @ApiStatus.Internal
    public CollectionCreationDto(String name, Boolean ordered, String[] seriesIds) {
        this.name = name;
        this.ordered = ordered;
        this.seriesIds = seriesIds;
    }
}
