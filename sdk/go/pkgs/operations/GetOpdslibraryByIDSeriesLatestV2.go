// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetOpdslibraryByIDSeriesLatestV2Request struct {
	Id   *string `pathParam:"style=simple,explode=false,name=id"`
	Page *int64  `queryParam:"style=simple,explode=false,name=page"` // Zero-based page index (0..N)
}

type GetOpdslibraryByIDSeriesLatestV2Response struct {
	// Success response
	Result *models.FeedDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetOpdslibraryByIDSeriesLatestV2
//
//meta:operation GET /opds/v2/libraries/{id}/series/latest
func GetOpdslibraryByIDSeriesLatestV2(client *resty.Client, ctx context.Context, req GetOpdslibraryByIDSeriesLatestV2Request) (*GetOpdslibraryByIDSeriesLatestV2Response, error) {
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
	resp, err := r.Get("/opds/v2/libraries/{id}/series/latest")
	if err != nil {
		return nil, err
	}

	return &GetOpdslibraryByIDSeriesLatestV2Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
