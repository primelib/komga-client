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
 * WpbelongsToDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("WpbelongsToDto")
@JsonPropertyOrder({
    "series",
    "collection"
})
@Generated(value = "io.github.primelib.primecodegen")
public class WpbelongsToDto {

    @JsonProperty("series")
    protected WpcontributorDto[] series;

    @JsonProperty("collection")
    protected WpcontributorDto[] collection;

    /**
     * Constructs a validated instance of {@link WpbelongsToDto}.
     *
     * @param spec the specification to process
     */
    public WpbelongsToDto(Consumer<WpbelongsToDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WpbelongsToDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WpbelongsToDto(Consumer)} instead.
     * @param series series
     * @param collection collection
     */
    @ApiStatus.Internal
    public WpbelongsToDto(WpcontributorDto[] series, WpcontributorDto[] collection) {
        this.series = series;
        this.collection = collection;
    }
}
