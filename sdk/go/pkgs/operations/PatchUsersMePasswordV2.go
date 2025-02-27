// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/komga-client/sdk/go/pkgs/models"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type PatchUsersMePasswordV2Request struct {
	Payload *models.PasswordUpdateDto `bodyParam:""`
}

type PatchUsersMePasswordV2Response struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// PatchUsersMePasswordV2
//
//meta:operation PATCH /api/v2/users/me/password
func PatchUsersMePasswordV2(client *resty.Client, ctx context.Context, req PatchUsersMePasswordV2Request) (*PatchUsersMePasswordV2Response, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeader("Content-Type", "application/json")
	r.SetHeaders(reqData.HeaderParams)
	r.SetPathParams(reqData.PathParams)
	r.SetQueryParamsFromValues(reqData.QueryParams)
	if reqData.BodyParam != nil {
		r.SetBody(reqData.BodyParam)
	}

	// send the request
	resp, err := r.Patch("/api/v2/users/me/password")
	if err != nil {
		return nil, err
	}

	return &PatchUsersMePasswordV2Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
