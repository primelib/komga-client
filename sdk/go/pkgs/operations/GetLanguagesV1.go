// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetLanguagesV1Request struct {
	LibraryId    *string `queryParam:"style=simple,explode=false,name=library_id"`
	CollectionId *string `queryParam:"style=simple,explode=false,name=collection_id"`
}

type GetLanguagesV1Response struct {
	// Success response
	Result []*string
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetLanguagesV1
//
//meta:operation GET /api/v1/languages
func GetLanguagesV1(client *resty.Client, ctx context.Context, req GetLanguagesV1Request) (*GetLanguagesV1Response, error) {
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
	var result []*string
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/languages")
	if err != nil {
		return nil, err
	}

	return &GetLanguagesV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
