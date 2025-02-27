// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.operations;

import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * GetSeriesBySeriesIDReadProgressTachiyomiV2
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetSeriesBySeriesIDReadProgressTachiyomiV2OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * 
     */
    // TODO: annotations
    private String seriesId;

    /**
     * Constructs a validated instance of {@link GetSeriesBySeriesIDReadProgressTachiyomiV2OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSeriesBySeriesIDReadProgressTachiyomiV2OperationSpec(Consumer<GetSeriesBySeriesIDReadProgressTachiyomiV2OperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(seriesId, "seriesId is a required parameter!");
    }
}
