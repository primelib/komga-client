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
 * ValIDAtionErrorResponse
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ValIDAtionErrorResponse")
@JsonPropertyOrder({
    "violations"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ValIDAtionErrorResponse {

    @JsonProperty("violations")
    protected Violation[] violations;

    /**
     * Constructs a validated instance of {@link ValIDAtionErrorResponse}.
     *
     * @param spec the specification to process
     */
    public ValIDAtionErrorResponse(Consumer<ValIDAtionErrorResponse> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ValIDAtionErrorResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ValIDAtionErrorResponse(Consumer)} instead.
     * @param violations violations
     */
    @ApiStatus.Internal
    public ValIDAtionErrorResponse(Violation[] violations) {
        this.violations = violations;
    }
}
