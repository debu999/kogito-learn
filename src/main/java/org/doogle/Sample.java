package org.doogle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sample {
    public String attributeA;
    public String attributeB;
    public String attributeC;
    public String attributeD;
}
