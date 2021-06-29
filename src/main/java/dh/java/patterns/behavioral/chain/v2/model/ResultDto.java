package dh.java.patterns.behavioral.chain.v2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;


@Value
@Getter
@Builder
@RequiredArgsConstructor
public class ResultDto {
    String message;
    Boolean result;
}
