// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.operations;

import io.github.primelib.komga.client.models.PageHashMatchDto;
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
 * PostPageHashByPageHashDeleteMatchV1
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class PostPageHashByPageHashDeleteMatchV1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * 
     */
    // TODO: annotations
    private String pageHash;

    /**
     * 
     */
    // TODO: annotations
    private PageHashMatchDto payload;

    /**
     * Constructs a validated instance of {@link PostPageHashByPageHashDeleteMatchV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PostPageHashByPageHashDeleteMatchV1OperationSpec(Consumer<PostPageHashByPageHashDeleteMatchV1OperationSpec> spec) {
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
        Objects.requireNonNull(pageHash, "pageHash is a required parameter!");
        Objects.requireNonNull(payload, "payload is a required parameter!");
    }
}
