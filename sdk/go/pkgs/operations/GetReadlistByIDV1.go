// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetReadlistByIDV1Request struct {
	Id *string `pathParam:"style=simple,explode=false,name=id"`
}

type GetReadlistByIDV1Response struct {
	// Success response
	Result *models.ReadListDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetReadlistByIDV1
//
//meta:operation GET /api/v1/readlists/{id}
func GetReadlistByIDV1(client *resty.Client, ctx context.Context, req GetReadlistByIDV1Request) (*GetReadlistByIDV1Response, error) {
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
	result := new(models.ReadListDto)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/api/v1/readlists/{id}")
	if err != nil {
		return nil, err
	}

	return &GetReadlistByIDV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
