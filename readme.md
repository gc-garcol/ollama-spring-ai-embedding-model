# Embeddings Model

- Embeddings are numerical representations of text, images, or videos that capture relationships between inputs.
- Embeddings work by converting text, image, and video into arrays of floating point numbers, called vectors. These vectors are designed to capture the meaning of the text, images, and videos. The length of the embedding array is called the vector’s dimensionality.
- By calculating the numerical distance between the vector representations of two pieces of text, an application can determine the similarity between the objects used to generate the embedding vectors.

## Stacks
- [spring AI embedded model](https://docs.spring.io/spring-ai/reference/api/embeddings/ollama-embeddings.html)
- [embedding-models](https://ollama.com/blog/embedding-models)

## Setup

```shell
ollama pull mxbai-embed-large
```

## Test

Query:
```shell
curl --location 'http://localhost:8080/animal' \
--header 'Content-Type: application/json' \
--data '{
  "query": "Which animal is best friend?",
  "limit": 1
}'
```

Result:
```shell
[
    "Dog: Known as loyal and friendly companions, dogs are social animals often regarded as \"man's best friend.\" They come in various breeds, each with unique temperaments and characteristics, and are used for companionship, work, and therapy.\n"
]
```
