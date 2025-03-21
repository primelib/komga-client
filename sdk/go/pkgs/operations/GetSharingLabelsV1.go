// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetSharingLabelsV1Request struct {
	LibraryId    *string `queryParam:"style=simple,explode=false,name=library_id"`
	CollectionId *string `queryParam:"style=simple,explode=false,name=collection_id"`
}

type GetSharingLabelsV1Response struct {
	// Success response
	Result []*string
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetSharingLabelsV1
//
//meta:operation GET /api/v1/sharing-labels
func GetSharingLabelsV1(client *resty.Client, ctx context.Context, req GetSharingLabelsV1Request) (*GetSharingLabelsV1Response, error) {
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
	resp, err := r.Get("/api/v1/sharing-labels")
	if err != nil {
		return nil, err
	}

	return &GetSharingLabelsV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
