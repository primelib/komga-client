// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PutReadlistByIDThumbnailByThumbnailIDSelectedV1Request struct {
	Id          *string `pathParam:"style=simple,explode=false,name=id"`
	ThumbnailId *string `pathParam:"style=simple,explode=false,name=thumbnailId"`
}

type PutReadlistByIDThumbnailByThumbnailIDSelectedV1Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PutReadlistByIDThumbnailByThumbnailIDSelectedV1
//
//meta:operation PUT /api/v1/readlists/{id}/thumbnails/{thumbnailId}/selected
func PutReadlistByIDThumbnailByThumbnailIDSelectedV1(client *resty.Client, ctx context.Context, req PutReadlistByIDThumbnailByThumbnailIDSelectedV1Request) (*PutReadlistByIDThumbnailByThumbnailIDSelectedV1Response, error) {
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
	resp, err := r.Put("/api/v1/readlists/{id}/thumbnails/{thumbnailId}/selected")
	if err != nil {
		return nil, err
	}

	return &PutReadlistByIDThumbnailByThumbnailIDSelectedV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
