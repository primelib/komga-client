// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type HeadOauth2ProvIDErsV1Request struct {
}

type HeadOauth2ProvIDErsV1Response struct {
	// Success response
	Result []*models.Oauth2ClientDto
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// HeadOauth2ProvIDErsV1
//
//meta:operation HEAD /api/v1/oauth2/providers
func HeadOauth2ProvIDErsV1(client *resty.Client, ctx context.Context, req HeadOauth2ProvIDErsV1Request) (*HeadOauth2ProvIDErsV1Response, error) {
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
	var result []*models.Oauth2ClientDto
	r.SetResult(result)

	// send the request
	resp, err := r.Head("/api/v1/oauth2/providers")
	if err != nil {
		return nil, err
	}

	return &HeadOauth2ProvIDErsV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
