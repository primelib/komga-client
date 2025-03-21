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
 * ReadListRequestMatchDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ReadListRequestMatchDto")
@JsonPropertyOrder({
    "readListMatch",
    "requests",
    "errorCode"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ReadListRequestMatchDto {

    @JsonProperty("readListMatch")
    protected ReadListMatchDto readListMatch;

    @JsonProperty("requests")
    protected ReadListRequestBookMatchesDto[] requests;

    @JsonProperty("errorCode")
    protected String errorCode;

    /**
     * Constructs a validated instance of {@link ReadListRequestMatchDto}.
     *
     * @param spec the specification to process
     */
    public ReadListRequestMatchDto(Consumer<ReadListRequestMatchDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ReadListRequestMatchDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ReadListRequestMatchDto(Consumer)} instead.
     * @param readListMatch readListMatch
     * @param requests requests
     * @param errorCode errorCode
     */
    @ApiStatus.Internal
    public ReadListRequestMatchDto(ReadListMatchDto readListMatch, ReadListRequestBookMatchesDto[] requests, String errorCode) {
        this.readListMatch = readListMatch;
        this.requests = requests;
        this.errorCode = errorCode;
    }
}
