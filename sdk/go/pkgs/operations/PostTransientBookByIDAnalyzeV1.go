// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PostTransientBookByIDAnalyzeV1Request struct {
	Id *string `pathParam:"style=simple,explode=false,name=id"`
}

type PostTransientBookByIDAnalyzeV1Response struct {
	// Success response
	Result *models.TransientBookDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PostTransientBookByIDAnalyzeV1
//
//meta:operation POST /api/v1/transient-books/{id}/analyze
func PostTransientBookByIDAnalyzeV1(client *resty.Client, ctx context.Context, req PostTransientBookByIDAnalyzeV1Request) (*PostTransientBookByIDAnalyzeV1Response, error) {
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
	result := new(models.TransientBookDto)
	r.SetResult(result)

	// send the request
	resp, err := r.Post("/api/v1/transient-books/{id}/analyze")
	if err != nil {
		return nil, err
	}

	return &PostTransientBookByIDAnalyzeV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
