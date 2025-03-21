// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetBooksOndeckV1Request struct {
	LibraryId []*string `queryParam:"style=simple,explode=false,name=library_id"`
	Page      *int64    `queryParam:"style=simple,explode=false,name=page"` // Zero-based page index (0..N)
	Size      *int64    `queryParam:"style=simple,explode=false,name=size"` // The size of the page to be returned
}

type GetBooksOndeckV1Response struct {
	// Success response
	Result *models.PageBookDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetBooksOndeckV1 Return first unread book of series with at least one book read and no books in progress.
//
//meta:operation GET /api/v1/books/ondeck
func GetBooksOndeckV1(client *resty.Client, ctx context.Context, req GetBooksOndeckV1Request) (*GetBooksOndeckV1Response, error) {
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
	resp, err := r.Get("/api/v1/books/ondeck")
	if err != nil {
		return nil, err
	}

	return &GetBooksOndeckV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
