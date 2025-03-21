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
 * SortObject
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("SortObject")
@JsonPropertyOrder({
    "sorted",
    "unsorted",
    "empty"
})
@Generated(value = "io.github.primelib.primecodegen")
public class SortObject {

    @JsonProperty("sorted")
    protected Boolean sorted;

    @JsonProperty("unsorted")
    protected Boolean unsorted;

    @JsonProperty("empty")
    protected Boolean empty;

    /**
     * Constructs a validated instance of {@link SortObject}.
     *
     * @param spec the specification to process
     */
    public SortObject(Consumer<SortObject> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SortObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SortObject(Consumer)} instead.
     * @param sorted sorted
     * @param unsorted unsorted
     * @param empty empty
     */
    @ApiStatus.Internal
    public SortObject(Boolean sorted, Boolean unsorted, Boolean empty) {
        this.sorted = sorted;
        this.unsorted = unsorted;
        this.empty = empty;
    }
}
