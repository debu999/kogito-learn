package org.doogle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CntDec {
    public Date createdDate;
    public Date updatedDate;
    public String cntdec;
}
