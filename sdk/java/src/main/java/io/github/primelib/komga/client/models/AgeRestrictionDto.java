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
 * AgeRestrictionDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AgeRestrictionDto")
@JsonPropertyOrder({
    "age",
    "restriction"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AgeRestrictionDto {

    @JsonProperty("age")
    protected Integer age;

    @JsonProperty("restriction")
    protected String restriction;

    /**
     * Constructs a validated instance of {@link AgeRestrictionDto}.
     *
     * @param spec the specification to process
     */
    public AgeRestrictionDto(Consumer<AgeRestrictionDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AgeRestrictionDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AgeRestrictionDto(Consumer)} instead.
     * @param age age
     * @param restriction restriction
     */
    @ApiStatus.Internal
    public AgeRestrictionDto(Integer age, String restriction) {
        this.age = age;
        this.restriction = restriction;
    }
}
