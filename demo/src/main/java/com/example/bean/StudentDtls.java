package com.example.bean;
import javax.validation.constraints.NotEmpty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public  class StudentDtls {
	@NonNull private @Getter @Setter @NotEmpty String name;
	@NonNull private  @Getter @Setter @NotEmpty String roll;
	@NonNull private  @Getter @Setter @NotEmpty long id;
	@NonNull private  @Getter @Setter @NotEmpty String gender;
	@NonNull private  @Getter @Setter @NotEmpty String age;

}
