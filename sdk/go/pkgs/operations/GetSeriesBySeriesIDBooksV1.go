// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetSeriesBySeriesIDBooksV1Request struct {
	SeriesId    *string   `pathParam:"style=simple,explode=false,name=seriesId"`
	MediaStatus []*string `queryParam:"style=simple,explode=false,name=media_status"`
	ReadStatus  []*string `queryParam:"style=simple,explode=false,name=read_status"`
	Tag         []*string `queryParam:"style=simple,explode=false,name=tag"`
	Deleted     *bool     `queryParam:"style=simple,explode=false,name=deleted"`
	Unpaged     *bool     `queryParam:"style=simple,explode=false,name=unpaged"`
	Page        *int64    `queryParam:"style=simple,explode=false,name=page"`   // Zero-based page index (0..N)
	Size        *int64    `queryParam:"style=simple,explode=false,name=size"`   // The size of the page to be returned
	Sort        []*string `queryParam:"style=simple,explode=false,name=sort"`   // Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
	Author      []*string `queryParam:"style=simple,explode=false,name=author"` // Author criteria in the format: name,role. Multiple author criteria are supported.
}

type GetSeriesBySeriesIDBooksV1Response struct {
	// Success response
	Result *models.PageBookDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetSeriesBySeriesIDBooksV1
//
//meta:operation GET /api/v1/series/{seriesId}/books
func GetSeriesBySeriesIDBooksV1(client *resty.Client, ctx context.Context, req GetSeriesBySeriesIDBooksV1Request) (*GetSeriesBySeriesIDBooksV1Response, error) {
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
	result := new(models.PageBookDto)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/series/{seriesId}/books")
	if err != nil {
		return nil, err
	}

	return &GetSeriesBySeriesIDBooksV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
