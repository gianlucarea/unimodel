package unimodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_Category extends EnumerationDescriptorBase {

  public EnumerationDescriptor_Category() {
    super(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5cdL, "Category", "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640333");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_PROFESSOR_0 = new EnumerationDescriptor.MemberDescriptor("PROFESSOR", "PROFESSOR", 0x79555ffcb891b5ceL, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640334");
  private final EnumerationDescriptor.MemberDescriptor myMember_PHD_STUDENT_0 = new EnumerationDescriptor.MemberDescriptor("PHD_STUDENT", "PHD_STUDENT", 0x79555ffcb891b5cfL, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640335");
  private final EnumerationDescriptor.MemberDescriptor myMember_ADMINISTRATOR_0 = new EnumerationDescriptor.MemberDescriptor("ADMINISTRATOR", "ADMINISTRATOR", 0x79555ffcb891b5d2L, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640338");
  private final EnumerationDescriptor.MemberDescriptor myMember_STAFF_0 = new EnumerationDescriptor.MemberDescriptor("STAFF", "STAFF", 0x79555ffcb891b5d6L, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640342");
  private final EnumerationDescriptor.MemberDescriptor myMember_STUDENT_0 = new EnumerationDescriptor.MemberDescriptor("STUDENT", "STUDENT", 0x79555ffcb891b5dbL, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640347");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5cdL, 0x79555ffcb891b5ceL, 0x79555ffcb891b5cfL, 0x79555ffcb891b5d2L, 0x79555ffcb891b5d6L, 0x79555ffcb891b5dbL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_PROFESSOR_0, myMember_PHD_STUDENT_0, myMember_ADMINISTRATOR_0, myMember_STAFF_0, myMember_STUDENT_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_PROFESSOR_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "PROFESSOR":
        return myMember_PROFESSOR_0;
      case "PHD_STUDENT":
        return myMember_PHD_STUDENT_0;
      case "ADMINISTRATOR":
        return myMember_ADMINISTRATOR_0;
      case "STAFF":
        return myMember_STAFF_0;
      case "STUDENT":
        return myMember_STUDENT_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}