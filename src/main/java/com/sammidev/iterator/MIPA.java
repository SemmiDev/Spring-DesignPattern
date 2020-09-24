package com.sammidev.iterator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MIPA {

    private String nisn;
    private String name;
    private TypeOfDepartment department;
}
