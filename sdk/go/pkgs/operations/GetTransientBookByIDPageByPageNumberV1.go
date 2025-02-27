// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetTransientBookByIDPageByPageNumberV1Request struct {
	Id         *string `pathParam:"style=simple,explode=false,name=id"`
	PageNumber *int32  `pathParam:"style=simple,explode=false,name=pageNumber"`
}

type GetTransientBookByIDPageByPageNumberV1Response struct {
	// Success response
	Result []*byte
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetTransientBookByIDPageByPageNumberV1
//
//meta:operation GET /api/v1/transient-books/{id}/pages/{pageNumber}
func GetTransientBookByIDPageByPageNumberV1(client *resty.Client, ctx context.Context, req GetTransientBookByIDPageByPageNumberV1Request) (*GetTransientBookByIDPageByPageNumberV1Response, error) {
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
	var result []*byte
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/transient-books/{id}/pages/{pageNumber}")
	if err != nil {
		return nil, err
	}

	return &GetTransientBookByIDPageByPageNumberV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
