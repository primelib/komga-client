// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PutBookByBookIDThumbnailByThumbnailIDSelectedV1Request struct {
	BookId      *string `pathParam:"style=simple,explode=false,name=bookId"`
	ThumbnailId *string `pathParam:"style=simple,explode=false,name=thumbnailId"`
}

type PutBookByBookIDThumbnailByThumbnailIDSelectedV1Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PutBookByBookIDThumbnailByThumbnailIDSelectedV1
//
//meta:operation PUT /api/v1/books/{bookId}/thumbnails/{thumbnailId}/selected
func PutBookByBookIDThumbnailByThumbnailIDSelectedV1(client *resty.Client, ctx context.Context, req PutBookByBookIDThumbnailByThumbnailIDSelectedV1Request) (*PutBookByBookIDThumbnailByThumbnailIDSelectedV1Response, error) {
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
	resp, err := r.Put("/api/v1/books/{bookId}/thumbnails/{thumbnailId}/selected")
	if err != nil {
		return nil, err
	}

	return &PutBookByBookIDThumbnailByThumbnailIDSelectedV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
