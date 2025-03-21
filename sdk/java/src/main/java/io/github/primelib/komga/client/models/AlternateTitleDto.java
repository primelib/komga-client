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
 * AlternateTitleDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AlternateTitleDto")
@JsonPropertyOrder({
    "label",
    "title"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AlternateTitleDto {

    @JsonProperty("label")
    protected String label;

    @JsonProperty("title")
    protected String title;

    /**
     * Constructs a validated instance of {@link AlternateTitleDto}.
     *
     * @param spec the specification to process
     */
    public AlternateTitleDto(Consumer<AlternateTitleDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlternateTitleDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlternateTitleDto(Consumer)} instead.
     * @param label label
     * @param title title
     */
    @ApiStatus.Internal
    public AlternateTitleDto(String label, String title) {
        this.label = label;
        this.title = title;
    }
}
