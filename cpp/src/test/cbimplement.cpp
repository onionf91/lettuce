#include "cbimplement.hpp"

#include <iostream>

int CbImplement::call(CbInfo *info, int *aiCode)
{
    std::cout << info->getMessage() << std::endl;
    std::cout << (*info->getUsername()) << std::endl;
    if (*info->sMessage_.pData == *JAVA.pData) {
        *aiCode = API_OK;
        return (NOT_OK);
    }
    else {
        *aiCode = API_OS_ERROR;
        return (OK);
    }
}
