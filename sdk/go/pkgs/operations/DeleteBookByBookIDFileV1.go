// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type DeleteBookByBookIDFileV1Request struct {
	BookId *string `pathParam:"style=simple,explode=false,name=bookId"`
}

type DeleteBookByBookIDFileV1Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// DeleteBookByBookIDFileV1
//
//meta:operation DELETE /api/v1/books/{bookId}/file
func DeleteBookByBookIDFileV1(client *resty.Client, ctx context.Context, req DeleteBookByBookIDFileV1Request) (*DeleteBookByBookIDFileV1Response, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeaders(reqData.HeaderParams)
	r.SetPathParams(reqData.PathParams)
	r.SetQueryParamsFromValues(reqData.QueryParams)
	if reqData.BodyParam != nil {
		r.SetBody(reqData.BodyParam)
	}

	// send the request
	resp, err := r.Delete("/api/v1/books/{bookId}/file")
	if err != nil {
		return nil, err
	}

	return &DeleteBookByBookIDFileV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
