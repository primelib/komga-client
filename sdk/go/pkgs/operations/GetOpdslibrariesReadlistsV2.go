// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetOpdslibrariesReadlistsV2Request struct {
	Page *int64 `queryParam:"style=simple,explode=false,name=page"` // Zero-based page index (0..N)
}

type GetOpdslibrariesReadlistsV2Response struct {
	// Success response
	Result *models.FeedDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetOpdslibrariesReadlistsV2
//
//meta:operation GET /opds/v2/libraries/readlists
func GetOpdslibrariesReadlistsV2(client *resty.Client, ctx context.Context, req GetOpdslibrariesReadlistsV2Request) (*GetOpdslibrariesReadlistsV2Response, error) {
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
	result := new(models.FeedDto)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/opds/v2/libraries/readlists")
	if err != nil {
		return nil, err
	}

	return &GetOpdslibrariesReadlistsV2Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
