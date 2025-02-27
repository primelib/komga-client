# Komga Client

A java http client library for Komga Client.

## Installation

```
implementation("io.github.primelib:komga-client:<version>")
```

## Usage

*Create client instances using the factory, you can choose different interfaces by changing the `api` parameter.*

```java
KomgaClientApi client = KomgaClientFactory.create(spec -> {
    spec.api(KomgaClientApi.class);
    spec.baseUrl("http://127.0.0.1:25600");
    spec.basicAuth(basic -> {
        basic.username("admin");
        basic.password("admin");
    });
    //spec.meterRegistry(meterRegistry);
    //spec.logLevel("FULL");
});
```
## License

This project is licensed under the [MIT](https://github.com/primelib/komga-client/blob/main/LICENSE) license.
