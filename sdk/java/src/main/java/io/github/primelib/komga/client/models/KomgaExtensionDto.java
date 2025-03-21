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
 * KomgaExtensionDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("KomgaExtensionDto")
@JsonPropertyOrder({
    "read"
})
@Generated(value = "io.github.primelib.primecodegen")
public class KomgaExtensionDto {

    @JsonProperty("read")
    protected Boolean read;

    /**
     * Constructs a validated instance of {@link KomgaExtensionDto}.
     *
     * @param spec the specification to process
     */
    public KomgaExtensionDto(Consumer<KomgaExtensionDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link KomgaExtensionDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #KomgaExtensionDto(Consumer)} instead.
     * @param read read
     */
    @ApiStatus.Internal
    public KomgaExtensionDto(Boolean read) {
        this.read = read;
    }
}
