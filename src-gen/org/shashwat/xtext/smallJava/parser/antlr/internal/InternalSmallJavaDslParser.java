package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'.'", "'final'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Namespace";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespace"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:70:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace75);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:77:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_smallJava_2_0= ruleSmallJava ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_smallJava_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_smallJava_2_0= ruleSmallJava ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_smallJava_2_0= ruleSmallJava ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_smallJava_2_0= ruleSmallJava ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_smallJava_2_0= ruleSmallJava ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespace122); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:103:2: ( (lv_smallJava_2_0= ruleSmallJava ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:104:1: (lv_smallJava_2_0= ruleSmallJava )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:104:1: (lv_smallJava_2_0= ruleSmallJava )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:105:3: lv_smallJava_2_0= ruleSmallJava
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getSmallJavaSmallJavaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSmallJava_in_ruleNamespace164);
            lv_smallJava_2_0=ruleSmallJava();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"smallJava",
                    		lv_smallJava_2_0, 
                    		"SmallJava");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:129:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:130:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:131:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName201);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:138:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:141:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:142:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:142:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:142:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName252); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:149:1: (kw= '.' this_ID_2= RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:150:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName271); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName286); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:170:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:171:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:172:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava333);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:179:1: ruleSmallJava returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:182:28: ( ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:183:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:183:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:183:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:183:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=24 && LA2_0<=25)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:184:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:184:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:185:3: lv_visibility_0_0= ruleVisibilityTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibilityTypes_in_ruleSmallJava389);
                    lv_visibility_0_0=ruleVisibilityTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"VisibilityTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:201:3: ( (lv_final_1_0= 'final' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:1: (lv_final_1_0= 'final' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:1: (lv_final_1_0= 'final' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:203:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,13,FOLLOW_13_in_ruleSmallJava408); 

                            newLeafNode(lv_final_1_0, grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSmallJava434); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getClassKeyword_2());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:220:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:221:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:221:1: (lv_name_3_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:222:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava451); 

            			newLeafNode(lv_name_3_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:238:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:238:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSmallJava469); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0());
                        
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:242:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:243:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:243:1: (otherlv_5= RULE_ID )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:244:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava489); 

                    		newLeafNode(otherlv_5, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSmallJava503); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:259:1: ( (lv_attribute_7_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=19 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:260:1: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:260:1: (lv_attribute_7_0= ruleAttribute )
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:261:3: lv_attribute_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleSmallJava524);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSmallJava537); 

                	newLeafNode(otherlv_8, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:289:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:290:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:291:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute573);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:298:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:301:28: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:302:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:302:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:302:2: ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:302:2: ( (lv_datatype_0_0= ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:303:1: (lv_datatype_0_0= ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:303:1: (lv_datatype_0_0= ruleDatatype )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:304:3: lv_datatype_0_0= ruleDatatype
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDatatype_in_ruleAttribute629);
            lv_datatype_0_0=ruleDatatype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"Datatype");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:320:2: ( (lv_array_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:321:1: (lv_array_1_0= '[]' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:321:1: (lv_array_1_0= '[]' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:322:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,18,FOLLOW_18_in_ruleAttribute647); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:335:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:336:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:336:1: (lv_name_2_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:337:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute678); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:361:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:362:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:363:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype719);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:370:1: ruleDatatype returns [EObject current=null] : ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_SmallJavaType_2 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:373:28: ( ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=19 && LA7_0<=23)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:2: ( () ruleSimpleType )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:2: ( () ruleSimpleType )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:3: () ruleSimpleType
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:374:3: ()
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:375:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDatatypeAccess().getDatatypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleDatatype780);
                    ruleSimpleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:390:5: this_SmallJavaType_2= ruleSmallJavaType
                    {
                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSmallJavaType_in_ruleDatatype808);
                    this_SmallJavaType_2=ruleSmallJavaType();

                    state._fsp--;

                     
                            current = this_SmallJavaType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:406:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:407:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:408:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType844);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:415:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:418:28: ( (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:419:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:419:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:420:2: kw= 'String'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSimpleType893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:427:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSimpleType912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:434:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSimpleType931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:441:2: kw= 'Decimal'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSimpleType950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:448:2: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSimpleType969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:461:1: entryRuleSmallJavaType returns [EObject current=null] : iv_ruleSmallJavaType= ruleSmallJavaType EOF ;
    public final EObject entryRuleSmallJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJavaType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:462:2: (iv_ruleSmallJavaType= ruleSmallJavaType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:463:2: iv_ruleSmallJavaType= ruleSmallJavaType EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType1009);
            iv_ruleSmallJavaType=ruleSmallJavaType();

            state._fsp--;

             current =iv_ruleSmallJavaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJavaType1019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJavaType"


    // $ANTLR start "ruleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:470:1: ruleSmallJavaType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSmallJavaType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:474:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:474:1: ( (otherlv_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:475:1: (otherlv_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:475:1: (otherlv_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:476:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJavaType1063); 

            		newLeafNode(otherlv_0, grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJavaType"


    // $ANTLR start "ruleVisibilityTypes"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:495:1: ruleVisibilityTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibilityTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:497:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:498:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:498:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:498:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:498:2: (enumLiteral_0= 'public' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:498:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleVisibilityTypes1112); 

                            current = grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:504:6: (enumLiteral_1= 'private' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:504:6: (enumLiteral_1= 'private' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:504:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleVisibilityTypes1129); 

                            current = grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespace122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace143 = new BitSet(new long[]{0x0000000003006000L});
    public static final BitSet FOLLOW_ruleSmallJava_in_ruleNamespace164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName252 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName286 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityTypes_in_ruleSmallJava389 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSmallJava408 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSmallJava434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava451 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSmallJava469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava489 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSmallJava503 = new BitSet(new long[]{0x0000000000FA0010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallJava524 = new BitSet(new long[]{0x0000000000FA0010L});
    public static final BitSet FOLLOW_17_in_ruleSmallJava537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleAttribute629 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleAttribute647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleDatatype780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_ruleDatatype808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSimpleType893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSimpleType912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleType931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleType950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSimpleType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJavaType1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJavaType1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVisibilityTypes1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVisibilityTypes1129 = new BitSet(new long[]{0x0000000000000002L});

}