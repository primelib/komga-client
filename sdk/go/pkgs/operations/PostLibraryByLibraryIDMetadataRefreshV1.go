// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PostLibraryByLibraryIDMetadataRefreshV1Request struct {
	LibraryId *string `pathParam:"style=simple,explode=false,name=libraryId"`
}

type PostLibraryByLibraryIDMetadataRefreshV1Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PostLibraryByLibraryIDMetadataRefreshV1
//
//meta:operation POST /api/v1/libraries/{libraryId}/metadata/refresh
func PostLibraryByLibraryIDMetadataRefreshV1(client *resty.Client, ctx context.Context, req PostLibraryByLibraryIDMetadataRefreshV1Request) (*PostLibraryByLibraryIDMetadataRefreshV1Response, error) {
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
	resp, err := r.Post("/api/v1/libraries/{libraryId}/metadata/refresh")
	if err != nil {
		return nil, err
	}

	return &PostLibraryByLibraryIDMetadataRefreshV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
