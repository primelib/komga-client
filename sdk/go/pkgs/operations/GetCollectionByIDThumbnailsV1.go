// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetCollectionByIDThumbnailsV1Request struct {
	Id *string `pathParam:"style=simple,explode=false,name=id"`
}

type GetCollectionByIDThumbnailsV1Response struct {
	// Success response
	Result []*models.ThumbnailSeriesCollectionDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetCollectionByIDThumbnailsV1
//
//meta:operation GET /api/v1/collections/{id}/thumbnails
func GetCollectionByIDThumbnailsV1(client *resty.Client, ctx context.Context, req GetCollectionByIDThumbnailsV1Request) (*GetCollectionByIDThumbnailsV1Response, error) {
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
	var result []*models.ThumbnailSeriesCollectionDto
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/collections/{id}/thumbnails")
	if err != nil {
		return nil, err
	}

	return &GetCollectionByIDThumbnailsV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
