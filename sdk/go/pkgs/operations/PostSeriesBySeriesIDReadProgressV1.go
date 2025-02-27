// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PostSeriesBySeriesIDReadProgressV1Request struct {
	SeriesId *string `pathParam:"style=simple,explode=false,name=seriesId"`
}

type PostSeriesBySeriesIDReadProgressV1Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PostSeriesBySeriesIDReadProgressV1 Mark all book for series as read
//
//meta:operation POST /api/v1/series/{seriesId}/read-progress
func PostSeriesBySeriesIDReadProgressV1(client *resty.Client, ctx context.Context, req PostSeriesBySeriesIDReadProgressV1Request) (*PostSeriesBySeriesIDReadProgressV1Response, error) {
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
	resp, err := r.Post("/api/v1/series/{seriesId}/read-progress")
	if err != nil {
		return nil, err
	}

	return &PostSeriesBySeriesIDReadProgressV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
