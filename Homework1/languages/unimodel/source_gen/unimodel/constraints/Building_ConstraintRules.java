package unimodel.constraints;

/*Generated by MPS */

import jetbrains.mps.core.aspects.constraints.rules.BaseRulesConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.constraints.rules.Rule;
import jetbrains.mps.core.aspects.constraints.rules.kinds.ContainmentContext;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.constraints.rules.BaseRule;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.core.aspects.constraints.rules.RuleId;
import jetbrains.mps.core.aspects.constraints.rules.kinds.PredefinedRuleKinds;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Building_ConstraintRules extends BaseRulesConstraintsDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b530L, "unimodel.structure.Building");

  public static final Rule<ContainmentContext> check_id8742999790642832116 = new Rule_Phone_Only_Digits();
  public static final Rule<ContainmentContext> check_id8742999790642842080 = new Rule_Phone_Length();

  private static final List<Rule<?>> RULES = Collections.unmodifiableList(Arrays.<Rule<?>>asList(check_id8742999790642832116, check_id8742999790642842080));

  @NotNull
  @Override
  public List<Rule<?>> getDeclaredRules() {
    return RULES;
  }

  public static final class Rule_Phone_Only_Digits extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/8742999790642832116");
    public static final RuleId ID_Phone_Only_Digits = new RuleId(8742999790642832116L, SOURCE_NODE_REF);

    public Rule_Phone_Only_Digits() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Phone_Only_Digits, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.phone$N1$i).matches("[0-9]+");
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_Phone_Length extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/8742999790642842080");
    public static final RuleId ID_Phone_Length = new RuleId(8742999790642842080L, SOURCE_NODE_REF);

    public Rule_Phone_Length() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Phone_Length, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.phone$N1$i).length() == 10;
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  /*package*/ Building_ConstraintRules() {
    super(CONCEPT);
  }

  private static final class PROPS {
    /*package*/ static final SProperty phone$N1$i = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b530L, 0x79555ffcb891b535L, "phone");
  }
}