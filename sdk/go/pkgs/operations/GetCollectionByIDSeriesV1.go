// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetCollectionByIDSeriesV1Request struct {
	Id           *string   `pathParam:"style=simple,explode=false,name=id"`
	LibraryId    []*string `queryParam:"style=simple,explode=false,name=library_id"`
	Status       []*string `queryParam:"style=simple,explode=false,name=status"`
	ReadStatus   []*string `queryParam:"style=simple,explode=false,name=read_status"`
	Publisher    []*string `queryParam:"style=simple,explode=false,name=publisher"`
	Language     []*string `queryParam:"style=simple,explode=false,name=language"`
	Genre        []*string `queryParam:"style=simple,explode=false,name=genre"`
	Tag          []*string `queryParam:"style=simple,explode=false,name=tag"`
	AgeRating    []*string `queryParam:"style=simple,explode=false,name=age_rating"`
	ReleaseYears []*string `queryParam:"style=simple,explode=false,name=release_years"`
	Deleted      *bool     `queryParam:"style=simple,explode=false,name=deleted"`
	Complete     *bool     `queryParam:"style=simple,explode=false,name=complete"`
	Unpaged      *bool     `queryParam:"style=simple,explode=false,name=unpaged"`
	Page         *int64    `queryParam:"style=simple,explode=false,name=page"`   // Zero-based page index (0..N)
	Size         *int64    `queryParam:"style=simple,explode=false,name=size"`   // The size of the page to be returned
	Author       []*string `queryParam:"style=simple,explode=false,name=author"` // Author criteria in the format: name,role. Multiple author criteria are supported.
}

type GetCollectionByIDSeriesV1Response struct {
	// Success response
	Result *models.PageSeriesDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetCollectionByIDSeriesV1
//
//meta:operation GET /api/v1/collections/{id}/series
func GetCollectionByIDSeriesV1(client *resty.Client, ctx context.Context, req GetCollectionByIDSeriesV1Request) (*GetCollectionByIDSeriesV1Response, error) {
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
	result := new(models.PageSeriesDto)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/collections/{id}/series")
	if err != nil {
		return nil, err
	}

	return &GetCollectionByIDSeriesV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
